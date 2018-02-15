# -------------------------------------------------------------------------------------------------
#
# Copyright (C) 2018, HERE Technologies and its affiliate(s). All rights reserved.
#
# This software and other materials contain proprietary information controlled by HERE and are
# protected by applicable copyright legislation. Any use and utilization of this software and other
# materials and disclosure to any third parties is conditional upon having a separate agreement
# with HERE for the access, use, utilization or disclosure of this software. In the absence of
# such agreement, the use of the software is not allowed.
#
# -------------------------------------------------------------------------------------------------
#
# Team: IVI Product Delivery Testing
# Maintainer: IVI_PRODUCT_DELIVERY_TESTING_ALL@here.com
# -------------------------------------------------------------------------------------------------
"""
*Description*

This module is intended to demonstrate the use of docstrings together with sphinx.
It contains one or more dummy functions with docstring formatted code documentation.

Some formatting:
  | *italic*
  | **bold**
  | `code example`

"""

def just_a_function():
  """
  This is where message body is written
   
  :param <name of parameter>: parameter description
  :param e.g. value: value of the attribute obtained
  :return: <return type>
  :raises: <error type>

  >>> just_a_function()
  Hello world

  """
  print ("Hello world")

if __name__ == "__main__":
    import doctest
    doctest.testmod()


